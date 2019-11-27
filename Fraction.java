public class Fraction {
	int hcf(int x,int y) {
		int smaller,larger,i;
		if(x>y) {
			smaller = y;
			larger = x;
		}
		else{
			smaller = x;
			larger = y;
		}
		i = smaller;
		while(i>=1) {
			if(smaller%i==0 && larger%i==0) 
				break;
			
			i-=1;
		}
		return i;
	}
	int numerator,denominator;

	public Fraction() {
		numerator=0;
		denominator=1;
	}
	public Fraction(int x) {
		numerator=x;
		denominator=1;
	}
	public Fraction(int x,int y) {
		numerator=x;
		denominator=y;
		numerator/=hcf(x,y);
		denominator/=hcf(x,y);
	}
	public Fraction(double x) {
		numerator = (int)(x*1000);
		denominator = 1000;
		int h = hcf(numerator,denominator);
		numerator/=h;
		denominator/=h;
	}

	public void add(Fraction b) {
		int n1 = b.numerator;
		int d1 = b.denominator;

		numerator = numerator * d1 + denominator * n1;
		denominator = denominator * d1;
		int h = hcf(numerator,denominator);
		numerator/=h;
		denominator/=h;

		System.out.printf("After adding: %d / %d",numerator,denominator);
	}

	public void print() {
		System.out.printf("%d / %d",numerator,denominator);
	}
	public static void main(String[] args) {
		 Fraction f1 = new Fraction();
		 Fraction f2 = new Fraction(16);
		 Fraction f3 = new Fraction(164,32);
		 Fraction f4 = new Fraction(0.354);
		 Fraction f5 = new Fraction(3,5);
		 System.out.printf("The N and D of an empty fraction(no arg in constructor) are: %d & %d  respectively\n",f1.numerator,f1.denominator);
		 System.out.printf("The N and D are: %d & %d  respectively\n",f2.numerator,f2.denominator);
		 System.out.printf("The N and D in reduced form are: %d & %d respectively\n",f3.numerator,f3.denominator);
		 System.out.printf("The N and D in reduced form (after conversion from decimal) are: %d & %d respectively\n",f4.numerator,f4.denominator);

		 System.out.printf("Testing add function: ");
		 f5.add(f3);
	}
}
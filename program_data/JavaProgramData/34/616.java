void jiaogu(int);
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	jiaogu(n);
	return 0;
}
void jiaogu(int a)
{
	 int i;
	 int j;
	 while (a != 1)
	 {
			 if (a % 2 == 0)
			 {
				  i = a / 2;
				  System.out.print(a);
				  System.out.print("/2=");
				  System.out.print(i);
				  System.out.print("\n");
				  a = a / 2;
			 }
			 else
			 {
				 j = a * 3 + 1;
				 System.out.print(a);
				 System.out.print("*3+1=");
				 System.out.print(j);
				 System.out.print("\n");
				 a = a * 3 + 1;
			 }
	 }
	 System.out.print("End");
	 System.out.print("\n");
}


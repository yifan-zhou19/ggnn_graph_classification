void change(int);
int main()
{
 int n;
 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
  for (;n != 1;)
  {
		if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
			n = n / 2;
		}
	 if (n % 2 == 1 && n != 1)
	 {
		 System.out.print(n);
		 System.out.print("*3+1=");
		 System.out.print(n * 3 + 1);
		 System.out.print("\n");
		 n = 3 * n + 1;
	 }
  }
  System.out.print("End");


return 0;
}


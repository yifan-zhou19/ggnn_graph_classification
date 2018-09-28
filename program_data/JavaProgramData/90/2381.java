int number = new int(int,int);
int main()
{
	 int n;
	 int apple;
	 int plate;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (int i = 1; i <= n; i++)
	 {
		 apple = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 plate = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 System.out.print(number(apple, plate));
		 System.out.print("\n");
	 }
	 return 0;
}
int number(int apple, int plate)
{
	if (apple < 0)
	{
		return 0;
	}
	if (apple == 0)
	{
		return 1;
	}
	if (apple > 0 && plate == 1 || apple == 1 && plate > 1)
	{
		return 1;
	}
	else
	{
		return number(apple, plate - 1) + number(apple - plate, plate);
	}
}



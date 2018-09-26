String s = new String(new char[100000]);
void tc(int);
int main()
{
	int[] a = new int[27];
	int i;
	int t;
	int k;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	while (k != 0)
	{
		q = 0;
		for (i = 1;i <= 26;i++)
		{
			a[i] = 0;
		}
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			t = s.charAt(i) - 96;
			a[t]++;
		}
		for (i = 1;i <= 26;i++)
		{
			if (a[i] > 1)
			{
				tc(i);
			}
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != 1)
			{
				System.out.printf("%c\n",s.charAt(i));
				q = 1;
				break;
			}
		}
		if (q == 0)
		{
			System.out.print("no\n");
		}
		k--;
	}
	return 0;
}
void tc(int i)
{
	 i = i + 96;
	 int j;
	 for (j = 0;s.charAt(j) != '\0';j++)
	 {
		 if (s.charAt(j) == i)
		 {
			 s = tangible.StringFunctions.changeCharacter(s, j, 1);
		 }
	 }
}



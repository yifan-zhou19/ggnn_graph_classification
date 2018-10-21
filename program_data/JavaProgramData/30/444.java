package <missing>;

public class GlobalMembers
{
	/*???:?7???????
	**?  ?:??
	**?  ?:2010?10?16?
	*/
	public static int Main()
	{
		int n; //??????
		int i;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n > 0 && n < 100)
		{
			for (i = 1;i <= n;i++)
			{
				if (i % 7 != 0) //?i???7???
				{
					if (i <= 9) //i?1???
					{
					sum = sum + i * i;
					} //????
					else if ((i / 10) != 7 && (i % 10) != 7) //?i?2????????7?
					{
						sum = sum + i * i; //????
					}
				}
			}
		}
			System.out.print(sum);
			System.out.print("\n");
			return 0;
	}

}


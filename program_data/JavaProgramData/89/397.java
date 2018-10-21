package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Ren1;
		int Ren2;
		int i;
		int j;
		int n;
		int[] value = new int[MAX];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			Ren1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			Ren2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (!(Ren1 == 0 && Ren2 == 0))
				{
				  value[Ren1]--;
				  value[Ren2]++;
				}
			   else
			   {
			   break;
			   }
		}

	   for (i = 0;i <= n - 1;i++)
	   {
		 if (value[i] == n - 1)
		 {
			  System.out.print(i);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			  goto line;
		 }
	   }
		 System.out.print("NOT FOUND");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	line:

	 return 0;
	}
}


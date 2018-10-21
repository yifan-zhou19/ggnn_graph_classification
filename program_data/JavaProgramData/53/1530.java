package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_a = new int[300];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int amount = 0;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int a[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			do
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					Main_a[i] = Integer.parseInt(tempVar2);
				}
			} while (Main_a[i] == ' ');
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (Main_a[j] == Main_a[i])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto no;
				}
			}
			if (amount == 0)
			{
				System.out.printf("%d",Main_a[i]);
			}
			else
			{
				System.out.printf(",%d",Main_a[i]);
			}
			amount = amount + 1;

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	no:
	continue;
		}
		return 0;
	}
}


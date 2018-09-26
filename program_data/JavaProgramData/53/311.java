package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int k;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 0,k = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < i;j++)
				{
				if (a[j] == a[i])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto loop;
				}
				}
			if (k != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",a[i]);
			k++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
			;
			}


	}

}


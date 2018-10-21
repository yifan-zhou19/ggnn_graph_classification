package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n = 1;
		int i;
		int j;
		int flag = 0;
		char b;
		for (; ;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n - 1] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			if (b != '\n')
			{
				n = n + 1;
			}
			else
			{
				break;
			}
		}


		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
			 if (a[i] < a[j])
			 {
			  int t = 0;
			  t = a[i];
			  a[i] = a[j];
			  a[j] = t;
			 }
			}
		}
			if (a[0] == a[n - 1])
			{
			System.out.print("No");
			}
			else
			{
			  for (i = 0;;i++)
			  {
				if (a[i] == a[i + 1])
				{
					flag = flag + 1;
				}
				 else
				 {
					break;
				 }
			  }
				System.out.printf("%d",a[flag + 1]);
			}
	}
}


package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			int[] a = new int[300];
			char c = ',';
			int i;
			int j;
			for (i = 0;i < n;i++)
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
						if (a[i] == a[j])
						{
							a[i] = 0;
							break;
						}
					}
					if (a[i] != 0)
					{
						if (i == 0)
						{
							System.out.printf("%d",a[i]);
						}
						else
						{
						System.out.printf("%c%d",c,a[i]);
						}

					}
				}
				return 0;
		}




}


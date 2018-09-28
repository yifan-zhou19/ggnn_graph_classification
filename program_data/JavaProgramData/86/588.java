package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[60];
		int i;
		int j;
		int k = 0;
		int[] s = new int[1000];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			t = 0;
			if (m == 0)
			{
				s[k] = 60;
			}
			else
			{
			  for (i = 0;i < m;i++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  a[i] = Integer.parseInt(tempVar3);
				  }
			  }
			   for (i = 0;i < m;i++)
			   {
				t = t + i * 3 + a[i];
				if (t < 60)
				{
					if (i < m - 1)
					{
						t = 0;
						continue;
					}
					else if (i == m - 1)
					{
						if (60 - t - 3 >= 0)
						{
							s[k] = a[i] + 60 - t - 3;
							break;
						}
						else
						{
							s[k] = a[i];
							break;
						}
					}
				}
				else
				{
					t = t + a[i - 1] - a[i] - 3;
				if ((60 - t - 3) < 0)
				{
					s[k] = a[i - 1];
					break;
				}
				else
				{
					s[k] = a[i - 1] + 60 - t - 3;
					break;
				}
				}
			   }
			}
			k++;
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",s[i]);
		}
	}



}


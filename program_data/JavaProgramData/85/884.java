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
		String[] a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		a = (String)malloc(sizeof(String) * n);
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 100);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			//gets(a[i]);
		}
		//for(i=0;i<n;i++)
			//puts(a[i]);
		int flag = 1;
		for (i = 0;i < n;i++)
		{
			if ((a[i][0] == 95) || (a[i][0] >= 65 && a[i][0] <= 90) || (a[i][0] >= 97 && a[i][0] <= 122))
			{
				for (j = 1;j < (int)String.valueOf(a[i]).length();j++)
				{
					if ((a[i][j] >= 48 && a[i][j] <= 57) || (a[i][j] >= 65 && a[i][j] <= 90) || (a[i][j] >= 97 && a[i][j] <= 122) || a[i][j] == 95)
					{
						continue;
					}
					else
					{
						System.out.print("no\n");
						break;
					}
				}
				if (j == (int)String.valueOf(a[i]).length())
				{
				   System.out.print("yes\n");
				}
			}

			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}




}


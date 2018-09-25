package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char[] x = (String)malloc((Character.SIZE / Byte.SIZE) * 100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char[] y = (String)malloc((Character.SIZE / Byte.SIZE) * 100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char[] a = (String)malloc((Character.SIZE / Byte.SIZE) * 100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char[] b = (String)malloc((Character.SIZE / Byte.SIZE) * 100);
		x = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int length = x.length();
		int l1 = a.length();
		int l2 = b.length();

		int yc = 0;
		int i;
		for (i = 0;i < length;i++)
		{
			if (x[i] == a[0] && (i == 0 || x[i - 1] == ' '))
			{
				int j;
				int test = 0;
				for (j = 1;j < l1;j++)
				{
					if (x[i + j] != a[j])
					{
						test = 1;
						break;
					}
				}
				if (test != 0)
				{
					//printf("error is :%c\n",x[i]);
					y[yc] = x[i];
					yc++;
					//printf("this y is:%s\n",y);
				}
				else
				{
					if ((i + j == length || x[i + j] == ' ') && (i == 0 || x[i - 1] == ' '))
					{
						int k;
						for (k = 0;k < l2;k++)
						{
							y[yc] = b[k];
							yc++;
						}
						i = i + j - 1;
					}
				}
			}
			else
			{
				y[yc] = x[i];
				yc++;
			}
		}
		System.out.printf("%s\n",y);

		return 0;
	}

}


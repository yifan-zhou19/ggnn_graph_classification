package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[200][20];
		String max1 = new String(new char[20]);
		String min1 = new String(new char[20]);
		int i;
		int j;
		int flag = 0;
		int max;
		int min;
		int p;
		int q;
		for (i = 0;;i++)
		{
			if (flag == 1)
			{
				a[i][0] = '\0';
				break;
			}
					  for (j = 0;;j++)
					  {
									String tempVar = ConsoleInput.scanfRead(null, 1);
									if (tempVar != null)
									{
										a[i][j] = tempVar.charAt(0);
									}
									if (a[i][j] == ' ')
									{
										a[i][j] = '\0';
										break;
									}
									if (a[i][j] == '\n')
									{
										a[i][j] = '\0';
										flag = 1;
										break;
									}
					  }
		}
		min = String.valueOf(a[0]).length();
		max = String.valueOf(a[0]).length();
		max1 = a[0];
		min1 = a[0];
		for (p = 0;p < i;p++)
		{
						 if (String.valueOf(a[p]).length() > max)
						 {
							 max = String.valueOf(a[p]).length();
							 max1 = a[p];
						 }
						 if (String.valueOf(a[p]).length() < min)
						 {
							 min = String.valueOf(a[p]).length();
							 min1 = a[p];
						 }
		}
		System.out.printf("%s\n",max1);
		System.out.printf("%s",min1);
		return 0;
	}

}


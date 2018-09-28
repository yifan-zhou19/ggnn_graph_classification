package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] a = new int[100];
		int[] b = new int[100];
		int x;
		String num = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		for (i = 0;i < num.length();i++)
		{
			a[i] = b[i] = 0;
			a[i] = num.charAt(i) - '0';
		}
		if (i == 1)
		{
			System.out.printf("0\n%d\n",a[0]);
		}
		else
		{
			x = a[0];
			for (j = 1;j < num.length();j++)
			{
				a[j] = 10 * x + a[j];
				b[j] = a[j] / 13;
				x = a[j] % 13;
			}
			if (b[1] != 0)
			{
				System.out.printf("%d",b[1]);
			}
			else if (j == 2)
			{
				System.out.printf("%d",b[1]);
			}
			for (k = 2;k < num.length();k++)
			{
				System.out.printf("%d",b[k]);
			}
			System.out.printf("\n%d",x);
		}
		return 0;
	}

}


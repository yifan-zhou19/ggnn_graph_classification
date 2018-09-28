package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String as = "0";
		final String bs = "0";
		int[] a = new int[201];
		int[] b = new int[201];
		int[] sum = new int[201];
		int lena;
		int lenb;
		int len;
		int jinwei = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			as = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			bs = tempVar2.charAt(0);
		}
		lena = as.length();
		lenb = bs.length();
		len = lena > lenb != 0?lena:lenb;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		for (i = 200;i > 200 - lena;i--)
		{
			a[i] = as.charAt(lena - 201 + i) - '0';
		}
		for (i = 200;i > 200 - lenb;i--)
		{
			b[i] = bs.charAt(lenb - 201 + i) - '0';
		}
		for (i = 200;i > 200 - len - 1;i--)
		{
			sum[i] = (jinwei + a[i] + b[i]) % 10;
			jinwei = (jinwei + a[i] + b[i]) / 10;
		}
		for (i = 200 - len;i <= 200;i++)
		{
			if (sum[i] != 0)
			{
				for (j = i;j <= 200;j++)
				{
					System.out.printf("%d",sum[j]);
				}
				break;
			}
			else if (i == 200)
			{
				System.out.print("0\n");
			}

		}
	}


}


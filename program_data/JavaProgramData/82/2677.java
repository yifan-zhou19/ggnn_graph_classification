package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int n;
		int s = 0;
		int i;
		int j = 0;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((a[i] >= 90) && (a[i] <= 140) && (b[i] >= 60) && (b[i] <= 90))
			{
				c[j]++;
			}
			else
			{
				j++;
			}
		}
		for (j = 0;j <= n;j++)
		{
			m = (m > c[j])?m:c[j];
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}




}


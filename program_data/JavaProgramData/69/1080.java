package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String cha = new String(new char[300]);
		String chb = new String(new char[300]);
		int[] a = new int[300];
		int[] b = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		cha = ConsoleInput.readToWhiteSpace(true).charAt(0);
		chb = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int k = 0;
		int lena;
		int lenb;
		lena = cha.length();
		lenb = chb.length();
		for (i = lena - 1;i >= 0;i--)
		{
			a[k++] = cha.charAt(i) - 48;
		}
		k = 0;
		for (i = lenb - 1;i >= 0;i--)
		{
			b[k++] = chb.charAt(i) - 48;
		}
		for (i = 0;i < 300;i++)
		{
			a[i] += b[i];
		}
		for (i = 0;i < 300;i++)
		{
			if (a[i] >= 10)
			{
				a[i] -= 10;
				a[i + 1]++;
			}
		}
		j = 299;
		while (a[j] == 0 && j > 0)
		{
			j--;
		}
		for (i = j;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}














}


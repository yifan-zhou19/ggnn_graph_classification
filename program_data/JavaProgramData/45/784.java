package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String w = new String(new char[100]);
		int ns;
		int nw;
		int i = 0;
		int j = 0;
		int sum = 0;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		ns = s.length();
		nw = w.length();
		while (i < ns && j < nw)
		{
			if (s.charAt(i) == w.charAt(j))
			{
			sum++;
			i++;
			j++;
			}
			else
			{
				sum = 0;
				i = 0;
				j++;
			}
		}
		if (sum == ns)
		{
		z = j - sum;
		System.out.printf("%d\n",z);
		}
	}








}


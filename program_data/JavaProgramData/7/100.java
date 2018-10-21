package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String y = new String(new char[100]);
		String h = new String(new char[100]);
		String c = new String(new char[100]);
		int i;
		int j;
		int[] len = new int[3];
		int count = 0;
		int k = 0;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			h = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		for (i = 0;i < y.length();i++)
		{
			for (j = 0;j < h.length();j++)
			{
				if (y.charAt(i + j) == h.charAt(j))
				{
				count++;
				}
			}
			if (count == h.length())
			{
				k++;
				a[k] = i;
			}
			count = 0;
		}
		if (k == 0)
		{
			System.out.printf("%s",y);
			return 0;
		}
		for (i = 0;i < a[1];i++)
		{
			System.out.printf("%c",y.charAt(i));
		}
			System.out.printf("%s",c);
			if (i == k)
			{
			   return 0;
			}
			for (j = a[1] + h.length();j < y.length();j++)
			{
				System.out.printf("%c",y.charAt(j));
			}
		return 0;
	}

}


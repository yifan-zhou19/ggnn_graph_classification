package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k = 0;
		int l;
		int max = 0;
		int maxx;
		int min;
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		char[][] a1 = new char[1000][100];
		char[][] b1 = new char[1000][100];
		int[] a2 = new int[1000];
		int[] b2 = new int[1000];
		int[] t = new int[1000];
		cin.get(a,10000);
		System.in.read();
		cin.get(b,10000);
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != ',')
			{
				a1[j][k] = a.charAt(i);
				k++;
			}
			if (a.charAt(i) == ',')
			{
				j++;
				k = 0;
			}
		}
		for (i = 0;i <= j;i++)
		{
			a2[i] = Integer.parseInt(a1[i]);
		}
		j = 0;
		k = 0;
		for (i = 0;i < b.length();i++)
		{
			if (b.charAt(i) != ',')
			{
				b1[j][k] = b.charAt(i);
				k++;
			}
			if (b.charAt(i) == ',')
			{
				j++;
				k = 0;
			}
		}
		for (i = 0;i <= j;i++)
		{
			b2[i] = Integer.parseInt(b1[i]);
		}
		for (i = 0;i < 1000;i++)
		{
			for (l = 0;l <= j;l++)
			{
			   if (i >= a2[l] != 0 && i < b2[l])
			   {
				   t[i]++;
			   }
			}
		}
		min = a2[0];
		maxx = b2[0];
		for (i = 0;i <= j;i++)
		{
			if (min > a2[i])
			{
				min = a2[i];
			}
			if (maxx < b2[i])
			{
				maxx = b2[i];
			}
		}
		max = t[0];
		for (i = min;i <= maxx;i++)
		{
			if (max < t[i])
			{
				max = t[i];
			}
		}
		System.out.print(j + 1);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}






}

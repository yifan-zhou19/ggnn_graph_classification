package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[257]);
		String sub = new String(new char[257]);
		String rep = new String(new char[257]);
		int result = 0;
		int a;
		int b;
		int c;
		int i;
		int d;
		int e = 0;
		int f;
		int g;
		int h;
		int j;
		int k;
		int[] len = new int[256];
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		a = str.length();
		b = sub.length();
		c = rep.length();
		for (i = 0;i < a;i++)
		{
		  for (d = 0;d < b - 1;d++)
		  {
			if ((str.charAt(i + d) == sub.charAt(d)) && (str.charAt(i + d + 1) == sub.charAt(d + 1)))
			{
			  result = 1;
			  len[e] = i;
			  e++;
			}
			break;
		  }
		}
		f = len[0];
		if (result == 1)
		{
		for (g = 0;g < f;g++)
		{
		 System.out.printf("%c",str.charAt(g));
		}
		for (h = 0;h < c;h++)
		{
		 System.out.printf("%c",rep.charAt(h));
		}
		for (j = 0;j < a - f - b;j++)
		{
		 System.out.printf("%c",str.charAt(f + b + j));
		}
		}
		else if (result == 0)
		{
		 System.out.println(str);
		}
		return 0;
	}
}

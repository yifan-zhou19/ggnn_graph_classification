package <missing>;

public class GlobalMembers
{
	public static int C(int Z,int X)
	{
		int V;
		  if (X == 0)
		  {
		  V = 1;
		  }
		  else
		  {
		  V = 1;
		  for (int B = 1;B <= X;B++)
		  {
		  V = V * Z;
		  }
		  }
		  return V;

	}
	public static int Main()
	{
		char q;
	  int d = 0;
		int o;
		int a;
		int b;
		int p;
		int k;
		int h;
		int i;
		int t;
		String n = new String(new char[20]);
		char l;
		char g;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  o = n.length();
		  int[] m = new int[o];
		for (k = 0;k <= o - 1;k++)
		{
		l = n.charAt(k);
		if (('9' - l >= 0) && ('0' - l <= 0))
		{
		l = l - '0';
		}
		else
		{
		if ((l <= 96) && (l >= 10))
		{
		l = l - 55;
		}
		else
		{
		if (l >= 97)
		{
		l = l - 87;
		}
		}
		}
		m[k] = l;
		}


		p = 0;
		for (k = 0;k <= o - 1;k++)
		{
			int s = o - k - 1;
		p = p + (m[k]) * (C(a, s));
		}

		if (p == 0)
		{
		System.out.print("0");
		}

		if (b >= 10)
		{
		for (int j = 9;j >= 0;j--)
		{

				t = p / (C(b, j));
				p = p - t * C(b, j);
				if (t != 0 || d != 0)
				{
				if (t >= 10 && t <= 50)
				{
				g = t + 55;
				System.out.printf("%c",g);
				}
				else
				{
				System.out.printf("%d",t);
				}
				d++;
				}
		}
		}
		else
		{
		for (int j = 20;j >= 0;j--)
		{

				t = p / (C(b, j));
				p = p - t * C(b, j);
				if (t != 0 || d != 0)
				{
				if (t >= 10 && t <= 50)
				{
				g = t + 55;
				System.out.printf("%c",g);
				}
				else
				{
				System.out.printf("%d",t);
				}
				d++;
				}
		}
		}

		System.in.read();
		System.in.read();
	}


}


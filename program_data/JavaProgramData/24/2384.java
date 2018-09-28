package <missing>;

public class GlobalMembers
{
	//*****************************************************************
	//*??????????? *****************************************
	//*??????? 1200012979 **************************************
	//*???2012.12.25 ***********************************************
	//*****************************************************************
	public static int Main()
	{
		int i;
		int k = 1;
		int len;
		int min = 30;
		int max = 0;
		int v;
		String a = new String(new char[3200]);
		String[] p = new String[200];
		String te = null;
		String yu = null;
		String te1;
		String yu1;
		p[0] = a;
		for (i = 0; i < 3200; i++)
		{
			cin.get(a.charAt(i));
			if (a.charAt(i) == '\n')
			{
				p[k] = a.Substring(i);
				break;
			}
			if (a.charAt(i) == ' ' && a.charAt(i - 1) != ',')
			{
				p[k++] = a.Substring(i);
			}
			if (a.charAt(i) == ',')
			{
				p[k++] = a.Substring(i);
			}
		}
		for (i = 1; i <= k; i++)
		{
			v = 0;
			if (p[i - 1] == ',')
			{
				v = 1;
			}
			if (i != 1)
			{
			  if (p[i] - p[i - 1] - 1 - v > max)
			  {
				  max = p[i] - p[i - 1] - 1;
				  te = p[i - 1] + 1 + v;
				  te1 = p[i];
			  }
			  if (p[i] - p[i - 1] - 1 - v < min)
			  {
				  min = p[i] - p[i - 1] - 1 - v;
				  yu = p[i - 1] + 1 + v;
				  yu1 = p[i];
			  }
			}
			else
			{
				if (p[i] - p[i - 1] > max)
				{
				  max = p[i] - p[i - 1];
				  te = p[i - 1];
				  te1 = p[i];
				}
				if (p[i] - p[i - 1] < min)
				{
				  min = p[i] - p[i - 1];
				  yu = p[i - 1];
				  yu1 = p[i];
				}
			}
		}
		while (te != te1)
		{
			System.out.print(te);
			te = te.Substring(1);
		}
		System.out.print("\n");
		while (yu != yu1)
		{
			System.out.print(yu);
			yu = yu.Substring(1);
		}
		System.in.read();
		return 0;
	}
}

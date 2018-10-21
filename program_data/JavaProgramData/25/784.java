package <missing>;

public class GlobalMembers
{
	/*************************
	 ***??:??? 1200012776
	 ***????:??2?N??
	 ***??:2012?12?5?
	 *************************/
	public static int length(int[] ch) //??length????????????
	{
		int i;
		for (i = 199; i >= 0; i--)
		{
			if (ch[i] != 0)
			{
			break;
			}
		}
		return (i + 1);
	}
	public static void multi(int[] ch, int a) //?????????,??multi,ch1(??)???ch1 * a
	{
		int i;
		int max = length(ch);
		int t;
		int[] ji = new int[200];
		for (i = 0; i <= max + 3; i++)
		{
			ji[i] = ch[i] * a;
			ji[i + 1] += ch[i] * a;
		}
		for (i = 0; i <= max + 3; i++) //????ji??????
		{
			t = ji[i];
			ji[i] = ji[i] % 10;
			ji[i + 1] += t / 10;
		}
		for (i = 0; i <= max + 5; i++) //??????????ch
		{
			ch[i] = ji[i];
		}
	}
	public static void pow(int p, int j, int[] chpow) //??a, b????,?chpow[]??(????)
	{
		int i;
		if (j == 0)
		{
			chpow[0] = 1;
		}
		else
		{
			chpow[0] = 1;
			for (i = 1; i <= j; i++)
			{
				multi(chpow, p);
			}
		}
	}
	public static int Main()
	{
		int i;
		int[] chpow = new int[200];
		int end;
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		pow(2, i, chpow);
		end = length(chpow);
		for (i = end - 1; i > -1; i--)
		{
			System.out.print(chpow[i]);
		}
		System.out.print("\n");
		return 0;
	}

}


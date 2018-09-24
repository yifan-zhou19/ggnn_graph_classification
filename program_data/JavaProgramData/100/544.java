package <missing>;

public class GlobalMembers
{
	public static int store(String str, String sto, int len)
	{
		int i;
		int m = 0;
		for (i = 0;i < len;i++)
		{
			if (str[i].compareTo('a') >= 0 && str[i].compareTo('z') <= 0)
			{
				sto[m] = str[i];
			m++;
			}
		}
		return (m);
	}
	public static void sort(String sto, int m)
	{
		int i;
		int j;
		int k;
		char t;
		for (i = 0;i < m - 1;i++)
		{
			k = i;
			for (j = i + 1;j < m;j++)
			{
				if (sto[j].compareTo(sto[k]) < 0)
				{
					k = j;
				}
			}
			if (k != i)
			{
				t = sto[i];
			sto[i] = sto[k];
			sto[k] = t;
			}
		}
	}


	public static int count(String sto, String newstr, int m, int[] time)
	{
		int i;
		int j;
		int flag;
		int k = 0;
		for (i = 0;i < m;i++)
		{
			flag = 1;
			for (j = 0;j <= k;j++)
			{
				if (sto[i].equals(newstr[j])) //??????????
				{
					time[j]++;
				flag = 0;
				break;
				}
			}
			if (flag != 0)
			{
				newstr[k] = sto[i];
			time[k]++;
			k++;
			} //??????????????
		}
		return (k);
	}
	public static void output(String newstr, int[] time, int k)
	{
		int i;
		for (i = 0;i < k;i++)
		{
			System.out.printf("%c=%d\n",newstr[i],time[i]);
		}
	}
	public static void Main()
	{
		String str = new String(new char[300]);
		final String sto = "";
		final String newstr = "";
		int[] time = new int[100];
		int len;
		int temp;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		temp = store(str, sto, len);
		if (temp == 0)
		{
			System.out.print("No\n");
		}
		else
		{
		sort(sto, temp);
		temp = count(sto, newstr, temp, time);
		output(newstr, time, temp);
		}
	}
}

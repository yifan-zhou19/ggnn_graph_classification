public class book
{
	public int id;
	public String s = new String(new char[L]);
	public int len;
}

package <missing>;

public class GlobalMembers
{
	public static book[] b = tangible.Arrays.initializeWithDefaultbookInstances(M);
	public static void fun(int[] count, String s, int len)
	{
		int i;
		for (i = 0;i < len;i++)
		{
			int m;
			m = s[i] - 'A';
			count[m]++;
		}
	}
	public static int judge(String s, int len, char name)
	{
		int i;
		int answer = 0;
		for (i = 0;i < len;i++)
		{
			if (s[i].equals(name))
			{
				answer = 1;
				break;
			}
		}
		return answer;
	}

	public static int Main()
	{
		int m;
		int k;
		int[] count = new int[L];
		int i;
		int j;
		int max;
		int num;
		char name;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 0;k < m;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[k].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[k].s = tempVar3.charAt(0);
			}
			b[k].len = String.valueOf(b[k].s).length();
			fun(count, b[k].s, b[k].len);
		}
		max = count[0];
		num = 0;
		for (j = 1;j < L;j++)
		{
			if (count[j] > max)
			{
				max = count[j];
				num = j;
			}
		}
		name = num + 65;
		System.out.printf("%c\n",name);
		System.out.printf("%d\n",max);
		for (k = 0;k < m;k++)
		{
			int answer = 0;
			answer = judge(b[k].s, b[k].len, name);
				if (answer == 1)
				{
					System.out.printf("%d\n",b[k].id);
				}
		}
		return 0;
	}



}


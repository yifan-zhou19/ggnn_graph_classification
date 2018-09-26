package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void sort(int[],int[],int);
		String str = new String(new char[1000]);
		char f;
		char s;
		String stack = new String(new char[1000]);
		int sum = 0;
		int j;
		int i;
		int l = 0;
		int tot = -1;
		int[] boy = new int[500];
		int[] girl = new int[500];
		int pair = -1;
		int[] num = new int[1000];
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i < l;i++)
		{
			if (i == 0)
			{
				f = str.charAt(sum++);
				stack = tangible.StringFunctions.changeCharacter(stack, ++tot, f);
				num[tot] = i;
				continue;
			}
			if (sum < 2 && str.charAt(i) != f)
			{
				sum++;
				s = str.charAt(i);
	System.out.printf("%c %c\n",f,s);
			}
			stack = tangible.StringFunctions.changeCharacter(stack, ++tot, str.charAt(i));
			num[tot] = i;
	for (j = 0;j < tot + 1;j++)
	{
		System.out.printf("%c",stack.charAt(j));
	}
	System.out.printf("%d\n",tot);
			while (tot > 0 && sum > 1 && stack.charAt(tot) == s && f == stack.charAt(tot - 1))
			{
				girl[++pair] = num[tot--];
				boy[pair] = num[tot--];
	System.out.printf("%d %d\n",boy[pair],girl[pair]);
			}
		}
		sort(boy, girl, pair);
		for (i = 0;i < pair;i++)
		{
			System.out.printf("%d %d\n",boy[i],girl[i]);
		}
		System.out.printf("%d %d",boy[pair],girl[pair]);
		return 0;
	}

	public static void sort(int[] a, int[] b, int c)
	{
		void swap(int,int);
		int i;
		int j;
		int k;
		for (i = 0;i < c;i++)
		{
			k = i;
			for (j = i + 1;j < c + 1;j++)
			{
				if (b[j] < b[k])
				{
					k = j;
				}
			}
			swap(a[i], a[k]);
			swap(b[i], b[k]);
		}
	}

	public static void swap(int x,int y)
	{
		int t;
		t = x;
		x = y;
		y = t;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zifu = new String(new char[101]);
		String[] word = {" "};
		String x = new String(new char[20]);
		String y = new String(new char[20]);
		int n; //num?????????+1
		int i;
		int j;
		int s;
		int t = 0;
		int p = 0;
		int num;
		zifu = new Scanner(System.in).nextLine();
		x = new Scanner(System.in).nextLine();
		y = new Scanner(System.in).nextLine();
		n = zifu.length();
		for (i = 0;i < n;i++)
		{
			if (zifu.charAt(i) != ' ')
			{
				word[t][p] = zifu.charAt(i);
				p++;
			}
			else if (zifu.charAt(i) == ' ')
			{
				p = 0;
				t++;
			}
			num = t + 1;
		}
		for (i = 0;i < num;i++)
		{
			if (!strcmp(word[i],x))
			{
				word[i] = y;
			}
		}
		System.out.printf("%s",word[0]);
		for (i = 1;i < num;i++)
		{
		  System.out.printf(" %s",word[i]);
		}
	   return 0;
	}




}

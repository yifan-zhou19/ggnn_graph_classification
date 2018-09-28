package <missing>;

public class GlobalMembers
{
	//0507
	///#include <queue>
	///#include <map>
	///#include <set>
	public static final int MAX = 250;
	public static char[] c1 = {0};
	public static char[] c2 = {0};
	//int a1[MAX]={0};
	public static int[] a2 = new int[MAX];
	public static int[] re = new int[MAX];
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a2,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(re,0,(Integer.SIZE / Byte.SIZE));
		c1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		//if(strcmp(c1,"0")==0&&c2=='0')
		int l1 = c1.length();
		int l2 = c2.length();
		int i;
		int j;
		for (i = 0;i < l1;i++)
		{
			re[i] = c1[l1 - i - 1] - '0';
		}
		for (i = 0;i < l2;i++)
		{
			a2[i] = c2[l2 - i - 1] - '0';
		}
		int l;
		if (l1 >= l2)
		{
			l = l1;
		}
		else
		{
			l = l2;
		}
		for (i = 0;i <= l;i++)
		{
			re[i] = re[i] + a2[i];
			while (re[i] >= 10)
			{
				re[i] -= 10;
				re[i + 1] += 1;
			}
		}
		i = 201;
		while (re[i] == 0 && i > -1)
		{
			i--;
		}
		if (i == -1)
		{
			System.out.print(0);
		}
		for (j = i;j >= 0;j--)
		{
			System.out.print(re[j]);
		}
		//cout<<endl;
		return 0;
	}
}


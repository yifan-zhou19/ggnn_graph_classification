package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0; //?????????
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}; //?????????????a[0]=x,??????a???
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		//x??
		char temp = 0; //????
		int test = 1; //???????????????
		for (i = 0;i < 300;i++)
		{
			temp = System.in.read(); //??????.
			//??????????300??????????
			//??????????,????????????
			if ('\n' == temp)
			{
				break;
			}
			if (temp >= 'A' && temp <= 'Z')
			{
				temp = temp - 'A';
			b[(int)temp]++;
			}
			if (temp >= 'a' && temp <= 'z')
			{
				temp = temp - 'a';
			a[(int)temp]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			//???????????????test=1,???0
			if (b[i] != null)
			{
				System.out.printf("%c=%d\n",('A' + i),b[i]);
				test = 0;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != null)
			{
				System.out.printf("%c=%d\n",('a' + i),a[i]);
				test = 0;
			}
		}
		if (test != 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

public class result
{
	public int man;
	public int woman;
}

package <missing>;

public class GlobalMembers
{
	public static result[] res = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	public static result temp = new result();
	public static int Main()
	{
		int i;
		int j;
		int p = -1;
		int sum = 0;
		int len;
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char std;
		str = new Scanner(System.in).nextLine();
		std = str[0];
		len = str.length();
		for (j = 0;;j++)
		{
			for (i = 0;i < len;i++)
			{
				if (str[i] == std && str[i] != str[i + 1 + j * 2] && str[i] != '\0' && str[i + 1 + j * 2] != '\0')
				{
					p++;
					res[p].man = i;
					res[p].woman = i + 1 + j * 2;
					str[i] = '\0';
					str[i + 1 + j * 2] = '\0';
					sum++;
				}
				else
				{
					continue;
				}
			}
			if (sum == len / 2)
			{
				break;
			}
		}
		for (i = 1;i < p + 1;i++)
		{
			for (j = 0;j < p + 1 - i;j++)
			{
				if (res[j].woman > res[j + 1].woman)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=res[j];
					temp.copyFrom(res[j]);
					res[j] = res[j + 1];
					res[j + 1] = temp;
				}
			}
		}
		for (i = 0;i <= p;i++)
		{
			System.out.printf("%d %d\n",res[i].man,res[i].woman);
		}
		return 0;
	}

}

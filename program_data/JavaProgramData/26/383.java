package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]); //?????????
		String p = null;
		cin.get(str,100); //?????
		int l = str.length(); //????
		p = str; //???
		for (int i = 0;i < l;i++)
		{
			if (*(p.Substring(i)) == ' ' && *(p.Substring(i) + 1) == ' ') //????
			{
				for (int j = i + 1;j < l;j++)
				{
					*(p.Substring(j)) = *(p.Substring(j) + 1); //???????
				}
				i = i - 1;
			}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}

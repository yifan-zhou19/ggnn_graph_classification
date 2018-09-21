package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l; //???????????????.
		int i;
		int[] t = new int[100];
		int k;
		String st = new String(new char[150]);
		st = new Scanner(System.in).nextLine();
		l = st.length();
		k = 1;
		t[0] = -1;
		for (i = 0;i < l;i++)
		{
			if (st.charAt(i) == ' ')
			{
				t[k] = i; //?????????
				k++;
			}
		}
		t[k] = l;
		for (i = k;i > 0;i--)
		{
			for (int j = t[i - 1] + 1;j <= t[i] - 1;j++)
			{
				System.out.print(st.charAt(j));
			}
			if (i != 1)
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		return 0;
	}


}

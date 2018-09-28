package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int dg(int l);

	public static char a;
	public static String st = new String(new char[1000]);

	public static int Main()
	{
		st = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a = st.charAt(0);
		int h = 0;
		int[] z = new int[100];
		for (int i = 1;i <= st.length();i++)
		{
			if (st.charAt(i - 1) == a)
			{
				h++;
				z[h] = i;
			}
			   else
			   {
				   System.out.print(z[h] - 1);
				   System.out.print(' ');
				   System.out.print(i - 1);
				   System.out.print("\n");
				   z[h] = 0;
				   h--;
			   }
		}

		return 0;
	}

}


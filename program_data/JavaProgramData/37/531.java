package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char c = 0;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int N,i,j,k;
		int N;
		int i;
		int j;
		int k;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;j < a.length();j++)
			{
				c = a.charAt(j);
				for (k = 0;k < a.length();k++)
				{
					if (c == a.charAt(k) && k != j)
					{
						break;
					}
				}
				///cout<<k<<strlen(a);
				if (k == a.length() && c != a.charAt(k))
				{
					//cout<<"asdf";
					System.out.print(c);
					System.out.print("\n");
					break;
				}
			}
			if (j == a.length() && k != a.length())
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}


		return 0;
	}


}


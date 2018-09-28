package <missing>;

public class GlobalMembers
{
	public static int com(char sz_)
	{
		int result;
		if (('a' <= sz_ && sz_ <= 'z') || sz_ == '_' || ('A' <= sz_ && sz_ <= 'Z'))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static int com1(char sz_1)
	{
		int result1;
		if (('a' <= sz_1 && sz_1 <= 'z') || sz_1 == '_' || ('A' <= sz_1 && sz_1 <= 'Z') || ('0' <= sz_1 && sz_1 <= '9'))

		{
			result1 = 1;
		}
		else
		{
			result1 = 0;
		}
		return result1;
	}
	public static int Main()
	{
		char[][] sz = new char[20][21];
		char sz_;
		char sz_1;
		int n;
		int HH;
		int JJ;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (HH = 0;HH < n;HH++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[HH] = tempVar2.charAt(0);
			}
		}


		for (HH = 0;HH < n;HH++)
		{
		  JJ = 0;

		  sz_ = sz[HH][JJ];
		  if (com(sz_) == 0)
		  {
				System.out.print("no\n");
				continue;
		  }
			for (JJ = 1;sz[HH][JJ] != '\0';JJ++)
			{
				sz_1 = sz[HH][JJ];
				if (com1(sz_1) == 0)
				{
					System.out.print("no\n");
				   break;

				}
			}
	  if (sz[HH][JJ] == '\0')
	  {
				System.out.print("yes\n");

	  }
		}





	   return 0;
	}



}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int s = 0;
		char name;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			name = System.in.read();
		for (i = 0;i < n;i++)
		{
			s = 0;
			name = System.in.read();
			if (('1' <= name && name <= '9') || name == '0')
			{
				s += 1;
			}
			do
			{

				if (('a' <= name && name <= 'z') || ('A' <= name && name <= 'Z') || name == '_' || ('1' <= name && name <= '9') || '0' == name)
				{
					s += 0;
			 //        printf("0");
				}
				else
				{
					s += 1;
			 //       printf("1");
				}
				name = System.in.read();
			}while (name != '\n');
			System.out.print("\n");
			if (s == 0)
			{
			   System.out.print("yes\n");
			}
			else
			{
			   System.out.print("no\n");
			}

		}


		return 0;
	}

}


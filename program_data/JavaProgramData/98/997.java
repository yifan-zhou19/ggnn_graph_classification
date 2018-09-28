package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int line = 80;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n > 0)
		{
			int changdu = 1;
			final String a = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p = null;
			p = a;
			char d = '\n';
			while (d == '\n')
			{
				d = System.in.read();
			}
			*p = d;
			while (true)
			{
				d = System.in.read();
				if (d == ' ' || d == '\n')
				{
					break;
				}
				changdu++;
				p++;
				*p = d;
			}
			p = a;
			int i;
			//for(i=1;i<=changdu;i++){cout<<*p;p++;}
			//cout<<endl<<changdu<<endl;

			if (changdu < line)
			{
				if (line != 80)
				{
					System.out.print(" ");
					line--;
				}
				for (i = 1;i <= changdu;i++)
				{
					System.out.print(p);
					p++;
				}
				line = line - changdu;
				if (line == 0)
				{
					System.out.print("\n");
					line = 80;
				}

			}
			else
			{
				System.out.print("\n");
				for (i = 1;i <= changdu;i++)
				{
					System.out.print(p);
					p++;
				}
				line = 80 - changdu;

			}


		n--;
		}


		return 0;
	}
}


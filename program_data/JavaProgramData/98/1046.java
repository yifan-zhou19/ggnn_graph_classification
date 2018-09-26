package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int num = 0;
		int i = 0;
		final String a = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		char c = System.in.read();
		while (c != '\n')
		{
			*p++=c;
			num++;
			c = System.in.read();
		}
		p = a.Substring(80);
		while (*p != '\0')
		{
			while (*p != ' ' && p < a.Substring(num) - 1)
			{
				p--;
			}
			*p = '\n';
			//while(*p!=' ')
			//{
			//	p--;
			//	if(*p==' ')
			//	{
			//		*p='\n';
			//	}
			//}
			p = p + 81;
		}
		p = a.Substring(num) - 1;
		while (*p == ' ')
		{
			*p = '\0';
			p--;
		}
		//bool m=true;
		//for(p=a+num-1;p>=a;p--)
		//{
		//	if(m==true && *p==' ')
		//	{
		//		*p='\0';
		//	}
		//	else if(*p!=' ')
		//	{
		//		m=false;
		//	}
		//}
		for (p = a; * p != '\0';p++)
		{
			System.out.print(p);
		}
		return 0;
	}
}


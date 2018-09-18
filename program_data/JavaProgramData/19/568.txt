package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String sen = new String(new char[100]);
		String targ = new String(new char[100]);
		String subs = new String(new char[100]);
		sen = new Scanner(System.in).nextLine();
		targ = new Scanner(System.in).nextLine();
		subs = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p; //c points to targ, p and q points to sen
		String q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * c;
		String t;
		int flag = 0;
		p = sen;
		c = targ;
		char[] output = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		while (p < sen + sen.length())
		{
			c = targ;
			while (*p++ != targ.charAt(0))
			{
				;
			}
			q = p - 1;
			if (q != sen && *(q - 1) != ' ')
			{
				continue;
			}
			p--;
			while (*c && *p++== *c++)
			{
				;
			}
			if ((*p == ' ' || *p == 0) && *c == 0)
			{
				flag = 1;
			}
			if (flag != 0)
			{
				t = p;
				output[0] = 0;
				output = sen.substring(0, q - sen);
				output[q - sen] = 0;
				output += subs;
				output += t;
				sen = output;
				p = sen;
			}

		}
		if (flag == 0)
		{
			System.out.println(sen);
			System.exit(0);
		}
				//A0 + SUB +A1, c->betw SUB & A1,q->betw A0 & SUB

		System.out.println(output);

	}
}

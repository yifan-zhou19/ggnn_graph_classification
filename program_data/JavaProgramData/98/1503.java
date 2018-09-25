package <missing>;

public class GlobalMembers
{
	public static void judge(String s, tangible.RefObject<Integer> n, tangible.RefObject<Integer> m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * b;
		String word = new String(new char[40]);
		int k = 0;
		for (a = s + n.argValue, b = word; * a != ' ' && *a != '\0';a++, b++)
		{
			k++;
			*b = a;
		}
		*b = '\0';
		if (k < 80 - m.argValue+1)
		{
			if (m.argValue != 1)
			{
				System.out.print(" ");
			}
			System.out.printf("%s",word);
			n.argValue = n.argValue + k + 1;
			m.argValue = m.argValue + k + 1;
			if (m.argValue > 80)
			{
				System.out.print("\n");
				m.argValue = 1;
			}
		}
		else
		{
			if (k == 80 - m.argValue+1)
			{
				System.out.print(" ");
				System.out.printf("%s\n",word);
				n.argValue = n.argValue + k + 1;
				m.argValue = 1;
			}
			else
			{
				System.out.printf("\n%s",word);
				n.argValue = n.argValue + k + 1;
				m.argValue = k + 2;
			}
		}
	}
	public static int Main()
	{
		void judge(char s[],int * n,int * m);
		int n;
		int now = 0;
		int line = 1;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *all=&now,*current=&line;
		int all = now;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *current=&line;
		int current = line;
		String para = new String(new char[2000]);
		char enter;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			enter = tempVar2.charAt(0);
		}
		para = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
		tangible.RefObject<Integer> tempRef_all = new tangible.RefObject<Integer>(all);
		tangible.RefObject<Integer> tempRef_current = new tangible.RefObject<Integer>(current);
			judge(para, tempRef_all, tempRef_current);
			current = tempRef_current.argValue;
			all = tempRef_all.argValue;
		}
		return 0;
	}
}


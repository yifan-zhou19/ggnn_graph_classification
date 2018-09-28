package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ori = new String(new char[102]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ptr;
		char qp;
		String head;
		String tail;
		int i;
		int n;
		ori = new Scanner(System.in).nextLine();
		n = ori.length();
		ptr = ori.charAt(0);
		for (i = 0;i < n - 1;i++)
		{
			qp = ptr + *(ptr + 1);
			System.out.printf("%c",qp);
			ptr++;
		}
		head = ori.charAt(0);
		tail = ori.charAt(n - 1);
		qp = head + tail;
		System.out.printf("%c\n",qp);
	}

}

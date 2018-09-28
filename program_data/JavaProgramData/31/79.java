// ???????????????

public class record
{
	public String str = new String(new char[100]);
}

public class YyxNode
{
	public record m_rec = new record();
	public YyxNode next;
}

public class YyxStack
{
	public int n;
	public YyxNode top;
}

package <missing>;

public class GlobalMembers
{
	public static YyxStack CreateNewStack()
	{
		YyxStack newSt;
		if ((newSt = new YyxStack()) == null)
		{
			System.out.print("Error: memory out! (1)\n");
			System.exit(-1);
		}
		newSt.n = 0;
		newSt.top = null;

		return newSt;
	}

	public static YyxStack Push(YyxStack st, record rec)
	{
		YyxNode newNode;
		if ((newNode = new YyxNode()) == null)
		{
			System.out.print("Error: memory out! (2)\n");
			System.exit(-1);
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: newNode->m_rec = *rec;
		newNode.m_rec.copyFrom(rec);
		newNode.next = st.top;
		st.top = newNode;
		st.n++;

		return st;
	}

	public static YyxStack Top(YyxStack st, record rec)
	{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *rec = st->top->m_rec;
		rec.copyFrom(st.top.m_rec);

		return st;
	}

	public static YyxStack Pop(YyxStack st)
	{
		YyxNode delNode = st.top;
		if (delNode == null)
		{
			return st;
		}
		st.top = delNode.next;
		st.n--;

		delNode = null;

		return st;
	}

	public static YyxStack ClearStack(YyxStack st)
	{
		while (st.top != null)
		{
			Pop(st);
		}

		return st;
	}

	public static int Main()
	{
		YyxStack mainSt;
		record stu = new record();
		mainSt = CreateNewStack();
		stu.str = new Scanner(System.in).nextLine();
		while (strcmp(stu.str, "end"))
		{
			Push(mainSt, stu);
			stu.str = new Scanner(System.in).nextLine();
		}
		while (mainSt.n > 0)
		{
			Pop(Top(mainSt, stu));
			System.out.println(stu.str);
		}

	//	free(ClearStack(mainSt));

		return 0;
	}

}

package <missing>;

public class GlobalMembers
{
	//*********************************
	//*??????????           *
	//*??????                   *
	//*???1200012775               *
	//*???2012/12/04               *
	//*????????               *
	//*????????               *
	//*********************************
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		String q = b;
		String s = null;
		do //???????
		{
			cin.get(*p);
		} while (*p++ != '\n');
		p = a; //??????
		while (*(p + 1) != '\n')
		{
			q = *p + *(p + 1);
			p++;
			q = q.Substring(1);
		} //???????????
		q = *p + *a; //??????????????????
		for (s = b; s <= q; s++)
		{
			System.out.print(s);
		}
		System.out.print("\n");
		return 0;
	}
}

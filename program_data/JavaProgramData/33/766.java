package <missing>;

public class GlobalMembers
{
	/*
	 * c.c
	 *
	 *  Created on: 2011-10-8
	 *      Author: lin
	 */





	public static int Main()
	{
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		String in = new String(new char[256]);
		while (t-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				in = tempVar2.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * pnt = in;
			while (*pnt != null)
			{
				switch (*pnt)
				{
				case 'A':
					System.out.print("T");
					break;
				case 'T':
					System.out.print("A");
					break;
				case 'C':
					System.out.print("G");
					break;
				case 'G':
					System.out.print("C");
					break;
				default:
					break;
				}
				pnt++;
			}
			System.out.print("\n");
		}
		return 0;
	}

}


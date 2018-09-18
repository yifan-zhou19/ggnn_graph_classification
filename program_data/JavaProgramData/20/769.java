package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String a = new String(new char[20]);
		String b = new String(new char[4]);
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (b = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			  char * pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			  char * pb = b;
			  String pmax = a;
			  for (pa = a; pa != a.charAt(a.length()); pa++)
			  {
				  if (*pa > pmax)
				  {
					  pmax = pa; //??ASCII????????pmax??????
				  }
			  }
			  for (pa = a.charAt(a.length()); pa != pmax; pa--) //?pmax??????????? ?b????
			  {
				  *(pa + 3) = *pa;
			  }
			  for (pa = pmax.Substring(1), pb = b;pb != b.charAt(3);pa++, pb++) //?b???pmax???????
			  {
				  *pa = pb;
			  }
			  pa = a;
			  System.out.print(pa);
			  System.out.print("\n");
		}


	return 0;
	}

}


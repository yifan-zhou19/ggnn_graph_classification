public class list
{
   public int n;
   public String str;
}

package <missing>;

public class GlobalMembers
{
	public static list create()
	{
	  list p1list = new list();
	  if (p1list != null)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1list.str = (String)malloc((Integer.SIZE / Byte.SIZE) * maxnum);
		 if (p1list.str != null)
		 {
		   return p1list;
		 }
	  }
	  return null;
	}
	public static int l = 0;
	public static void plusdzs(list palist, list pblist, list pclist)
	{
	  int a;
	  int b;
	  int l1;
	  int l2;
	  int i;
	  l1 = (int)palist.str.length();
	  l2 = (int)pblist.str.length();
	  while (l1 > 0 || l2 > 0)
	  {
		 a = l1 > 0?palist.str.charAt(l1 - 1) - '0':0;
		 b = l2 > 0?pblist.str.charAt(l2 - 1) - '0':0;
		 if (l == 0)
		 {
			 pclist.str = tangible.StringFunctions.changeCharacter(pclist.str, l + 1, (a + b) / 10);
		 pclist.str = tangible.StringFunctions.changeCharacter(pclist.str, l, (a + b) % 10);
		 }
		 else
		 {
			 pclist.str = tangible.StringFunctions.changeCharacter(pclist.str, l + 1, (pclist.str.charAt(l) + a + b) / 10);
		 pclist.str = tangible.StringFunctions.changeCharacter(pclist.str, l, (pclist.str.charAt(l) + a + b) % 10);
		 }
		 l1--;
		 l2--;
		 l++;
	  }
	}
	public static void printout(list pclist, int l)
	{
	  while (l > 0 && pclist.str.charAt(l) == 0)
	  {
	  l--;
	  }
	  int i;
	  for (i = l;i >= 0;i--)
	  {
	  System.out.printf("%d",pclist.str.charAt(i));
	  }
	}
	public static int Main()
	{
	  list palist = create();
	  list pblist = create();
	  list pclist = create();
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  palist.str = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  pblist.str = tempVar2.charAt(0);
	  }
	  plusdzs(palist, pblist, pclist);
	  printout(pclist, l);

	}

}


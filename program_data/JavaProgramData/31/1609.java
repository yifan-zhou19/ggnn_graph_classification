public class s
{
	  public String a = new String(new char[100]);
	  public String b = new String(new char[100]);
	  public char c;
	  public int d;
	  public String e = new String(new char[100]);
	  public String f = new String(new char[100]);
	  public s t;
}

package <missing>;

public class GlobalMembers
{
		  public static s[] k = tangible.Arrays.initializeWithDefaultsInstances(1000);
	public static int n;
	public static void Main(String[] args)
	{
		int i;
		s head;
		s p;
	  for (i = 0;;i++)
	  {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k[i].a = tempVar.charAt(0);
		 }
		 if (strcmp(k[i].a,"end") == 0)
		 {
		 break;
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 k[i].b = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar3 != null)
		 {
			 k[i].c = tempVar3.charAt(0);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 k[i].d = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ");
		 if (tempVar5 != null)
		 {
			 k[i].e = tempVar5.charAt(0);
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ");
		 if (tempVar6 != null)
		 {
			 k[i].f = tempVar6.charAt(0);
		 }
		 if (i > 0)
		 {
		 k[i].t = k[i - 1];
		 }
		 if (i == 0)
		 {
		 k[i].t = null;
		 }
	  }
	  head = k[i - 1];
	  p = head;
	  do
	  {
	  System.out.printf("%s %s %c %d %s %s\n",p.a,p.b,p.c,p.d,p.e,p.f);
	  p = p.t;
	  } while (p != null);
	}

}


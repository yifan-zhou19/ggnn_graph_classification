package <missing>;

public class GlobalMembers
{
	public static int judge(tangible.RefObject<String> a, tangible.RefObject<String> b, double r)
	{
	  int n = a.argValue.length();
	  int m = b.argValue.length();
	  int i;
	  int s = 0;
	  if (n != m)
	  {
		  return 0;
	  }
	  for (i = 0; i < n; ++i)
	  {
		if (!tangible.StringFunctions.strChr("ATCG", a.argValue.charAt(i)) || !tangible.StringFunctions.strChr("ATCG", b.argValue.charAt(i)))
		{
			return 0;
		}
		if (a.argValue.charAt(i) == b.argValue.charAt(i))
		{
			++s;
		}
	  }
	  if (s / (double)n > r)
	  {
		  return 1;
	  }
	  else
	  {
		  return -1;
	  }
	}

	public static int Main()
	{
	  String a = new String(new char[600]);
	  String b = new String(new char[600]);
	  double r;
	  int s;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  r = Double.parseDouble(tempVar);
	  }
	  a = new Scanner(System.in).nextLine();
	  b = new Scanner(System.in).nextLine();
  tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
  tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
	  s = judge(tempRef_a, tempRef_b, r);
	  b = tempRef_b.argValue;
	  a = tempRef_a.argValue;
	  if (s > 0)
	  {
		System.out.println("yes");
	  }
	  else if (s < 0)
	  {
		System.out.println("no");
	  }
	  else
	  {
		System.out.println("error");
	  }
	  return 0;
	}

}


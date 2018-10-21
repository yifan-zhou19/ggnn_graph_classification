package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n = 0;
	int i;
	int word = 0;
	int num = 0;
	int max = 0;
	int min = 20;
	int mx = 0;
	int mn = 0;
	String string = new String(new char[500]);
	int[] wn = new int[50];
	int[] wm = new int[50];
	for (i = 0;i < 50;i++)
	{
		wn[i] = 1;
	}
	String = new Scanner(System.in).nextLine();
	for (i = 0;string.charAt(i) != '\0';i++)
	{
		  if (String[i] == ' ')
		  {
			  word = 0;
			  n++;
		  }
	  else if (word == 0)
	  {
		  word = 1;
		  num++;
		  wm[n] = i;
	  }
	  else if (word)
	  {
		  wn[n]++;
	  }
	}

	for (i = 0;i < num;i++)
	{
		  if (wn[i] > max)
		  {
			  max = wn[i];
			  mx = wm[i];
		  }
	   if (wn[i] < min)
	   {
		   min = wn[i];
		   mn = wm[i];
	   }
	}
	for (i = mx;i < mx + max;i++)
	{
	System.out.printf("%c",string.charAt(i));
	}
	System.out.print("\n");
	for (i = mn;i < mn + min;i++)
	{
	System.out.printf("%c",string.charAt(i));
	}
	System.out.print("\n");
	}
}

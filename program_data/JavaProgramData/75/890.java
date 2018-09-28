import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int p;
		int s;
		int k;
		int total;
		int mintime = 1000;
		int maxtime = 0;
		int mostnum = 0;
		int[] in = new int[3000];
		int[] out = new int[3000];
		int people;
		String s1 = new String(new char[10000]);
		String s2 = new String(new char[10000]);
		String time = new String(new char[5]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		j = 0;
		k = 0;
		time = tangible.StringFunctions.changeCharacter(time, 0, '\0');
		for (i = 0;i < s1.length();i++)
		{
			  if (s1.charAt(i) != ',')
			  {
				 time = tangible.StringFunctions.changeCharacter(time, k, s1.charAt(i));
			  k++;
			  }
			 else
			 {
				   time = tangible.StringFunctions.changeCharacter(time, k, '\0');
				p = 1;
				for (t = time.length() - 1;t >= 0;t--)
				{
				   in[j] += p * (time.charAt(t) - '0');
				   p *= 10;
				}
				if (in[j] < mintime)
				{
					mintime = in[j];
				}
				j++;
				k = 0;
				time = tangible.StringFunctions.changeCharacter(time, 0, '\0');
			 }
		}
		  total = j + 1;
		  time = tangible.StringFunctions.changeCharacter(time, k, '\0');
		  p = 1;
		  for (t = time.length() - 1;t >= 0;t--)
		  {
			  in[j] += p * (time.charAt(t) - '0');
			  p *= 10;
		  }
		if (in[j] < mintime)
		{
			mintime = in[j];
		}
		j = 0;
		k = 0;
		time = tangible.StringFunctions.changeCharacter(time, 0, '\0');
		for (i = 0;i < s2.length();i++)
		{
			  if (s2.charAt(i) != ',')
			  {
				 time = tangible.StringFunctions.changeCharacter(time, k, s2.charAt(i));
			  k++;
			  }
			 else
			 {
				   time = tangible.StringFunctions.changeCharacter(time, k, '\0');
				p = 1;
				for (t = time.length() - 1;t >= 0;t--)
				{
				   out[j] += p * (time.charAt(t) - '0');
				   p *= 10;
				}
				if (out[j] > maxtime)
				{
					maxtime = out[j];
				}
				j++;
				k = 0;
				time = tangible.StringFunctions.changeCharacter(time, 0, '\0');
			 }
		}
		  time = tangible.StringFunctions.changeCharacter(time, k, '\0');
		  p = 1;
		  for (t = time.length() - 1;t >= 0;t--)
		  {
			  out[j] += p * (time.charAt(t) - '0');
			  p *= 10;
		  }
		  if (out[j] > maxtime)
		  {
			  maxtime = out[j];
		  }
		  for (i = mintime;i < maxtime;i++)
		  {
				people = 0;
			 for (j = 0;j < total;j++)
			 {
				  if ((in[j] <= i) && (out[j]> i))
				  {
				 people++;
				  }
			 }
			  if (people > mostnum)
			  {
				  mostnum = people;
			  }
		  }
		System.out.print(total);
		System.out.print(" ");
		System.out.print(mostnum);
		System.out.print("\n");
		   return 0;
	}

}


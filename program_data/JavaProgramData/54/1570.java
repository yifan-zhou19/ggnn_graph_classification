package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n; //n????????k?
	  int k;
	  int[] apple = new int[1000];
	  int j = 0;
	  int m = 0;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (int i = 0;i < 1000;i++)
	  {
		  apple[i] = k; //??????????
	  }

	  do
	  {
		  apple [n] = apple[n] + n; //?apple[n]???????n?
		  for (j = n - 1;j >= 1;j--)
		  {
			  if (apple [j + 1] % (n - 1) != 0) //????????????n-1?????????
			  {
			  break;
			  }
			  else
			  {
			  apple[j] = apple[j + 1] * n / (n - 1) + k;
			  }
		  }
	  } while (j >= 1);
	  for (int k = 0;k < n;k++)
	  {
		  if (apple[k] > m)
		  {
		  m = apple[k]; //????????????
		  }
	  }

	  System.out.print(m);
	  System.out.print("\n");

	  return 0;
	}
}


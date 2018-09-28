package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String input = new String(new char[LEN]);
	  int max = 0;
	  int min = 0;
	  int mxlen = 0;
	  int mnlen = 1000;
	  int i = 0;
	  int j;
	  int k = 0;
	  int word;
	  int num;
	  fgets(input,LEN,stdin);
	  while (input.charAt(i) != '\0')
	  {
		  j = 0;
		  while (Character.isLetter(input.charAt(i)))
		  {
		  i++;
		  j++;
		  }
		  while ((!Character.isLetter(input.charAt(i))) && (input.charAt(i) != '\0'))
		  {
		i++;
		  }
		  if (j > 0)
		  {
		  k++;
		  max = (mxlen >= j)? max:k;
		  min = (mnlen <= j)? min:k;
		  mxlen = (mxlen >= j)? mxlen:j;
		  mnlen = (mnlen <= j)? mnlen:j;
		  }
	  }
	  word = 0;
	  num = 0;
	  for (i = 0;input.charAt(i) != '\0';i++)
	  {
		  if (!Character.isLetter(input.charAt(i)))
		  {
		 word = 0;
		  }
		  else if (word == 0)
		  {
		  word = 1;
		  num++;
		  }
		  if (num == max)
		  {
		break;
		  }
	  }
	  for (j = 0;j < mxlen;j++)
	  {
		System.out.printf("%c",input.charAt(i + j));
	  }
	  System.out.print("\n");
	  word = 0;
	  num = 0;
	  for (i = 0;input.charAt(i) != '\0';i++)
	  {
		  if (!Character.isLetter(input.charAt(i)))
		  {
		 word = 0;
		  }
		  else if (word == 0)
		  {
		  word = 1;
		  num++;
		  }
		  if (num == min)
		  {
		break;
		  }
	  }
	  for (j = 0;j < mnlen;j++)
	  {
		System.out.printf("%c",input.charAt(i + j));
	  }
	  System.out.print("\n");
	  return 0;
	}

}

void judge(double,double); //??
double standard; //???????
final double m = 0.05; //??
int main()
{
  int n;
  int i;
  double sum;
  double useful;
  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
  sum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
  useful = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
  standard = useful / sum;
  for (i = 2;i <= n;i++)
  {
	sum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	useful = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	judge(sum,useful);
  }
  return 0;
}
void judge(double sum,double useful)
{
  double rate;
  rate = useful / sum;
  if (Math.abs(rate - standard) <= m)
  {
	  System.out.print("same");
	  System.out.print("\n");
  }
  else if (rate - standard > m)
  {
	  System.out.print("better");
	  System.out.print("\n");
  }
  else
  {
	  System.out.print("worse");
	  System.out.print("\n");
  }
}


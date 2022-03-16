class Cash
  attr_reader :total_amount

  def initialize(amount)
    @total_amount = amount
  end

  def valid?
    valid_amount == total_amount
  end

  def valid_amount
    # Valid amount
  end